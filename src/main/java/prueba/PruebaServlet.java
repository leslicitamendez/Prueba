package prueba;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PruebaServlet extends HttpServlet
{
	Bisiesto bisiesto = new Bisiesto();
	
	@Override
	protected void service(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException
            {
				String year = request.getParameter("anho");
				bisiesto.setAnho(Integer.parseInt(year));
				if (bisiesto.esAnhoBisiesto()) {
					response.getWriter().println(
                                "El anho " + bisiesto.getAnho() + " es Bisiesto!");
				} else {
                response.getWriter().println(
                                "El anho " + bisiesto.getAnho() + " No es Bisiesto!");
        }
            }
}