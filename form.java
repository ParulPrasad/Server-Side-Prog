package form;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/show")
public class form extends HttpServlet {
  @Override
  public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
	  String name=req.getParameter("t1");
	  String gender=req.getParameter("gender");
	  List<String>langs=Arrays.asList(req.getParameter("cblang"));
	  String country=req.getParameter("country");
	  
	  PrintWriter out=res.getWriter();
	  out.println("name: "+name);
	  out.println("gender: "+gender);
	  out.println("lang: "+langs);
	  langs.forEach((a)->out.println(a));
	  out.println("country: "+country);
  }
}
