package com;
import java.util.Date;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


@WebServlet("/Controller")
public class Controller extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		System.out.println("Inside Controller Servlet");
		String t=req.getParameter("banglatext");
		System.out.println(t);
		pw.println(t);
		SessionFactory sessionFactory = (SessionFactory) new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try
		{

			bangla b=new bangla();
			tx = session.beginTransaction();
			b.setName(t);
			session.save(b);
			tx.commit();
			session.close();
			sessionFactory.close();
			String successMsg = "Data Inserted succesfully";
			System.out.println(successMsg);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
