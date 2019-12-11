import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet",urlPatterns = "/caculator")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,Integer> product = new HashMap<>();
        product.put("iphone",15000);
        product.put("nokia",10000);

        String search = request.getParameter("product");
        PrintWriter writer = response.getWriter();
        Integer price = product.get(search);

        writer.println("<html>");
        if (price != null){
            Float percent = Float.parseFloat(request.getParameter("discount"));
            double result = price*percent*0.1;
            writer.println("result:"+result);
        }else {
            writer.println("Not found");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
