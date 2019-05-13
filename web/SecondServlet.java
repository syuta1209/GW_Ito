package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	// dopostをオーバーライド
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 送信されてくるパラメータのエンコーディングの指定
		//送信後に表示する文字をエンコーディングする
		req.setCharacterEncoding("UTF-8");
		// 送信したパラメータの取得（文字列）
		//htmlのparamを探しに行く、入力した値をｘに代入
		String x = req.getParameter("param");
		// 以下、HTML形式で出力されるためのコード
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1>" + x + "</h1>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
	}
}
