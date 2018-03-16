
import com.arun.DBConnection;
import com.arun.LoginServlet;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TestLoginServlet extends TestCase {

    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;

    @Mock
    RequestDispatcher requestDispatcher;

    @Before
    protected void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test() throws Exception {

        PreparedStatement preparedStatement = mock(PreparedStatement.class);
        Connection connection = mock(Connection.class);
        ResultSet resultSet = mock(ResultSet.class);
        when(preparedStatement.executeQuery()).thenReturn(resultSet);

        DBConnection dbConnection = mock(DBConnection.class);
        when(dbConnection.getConnection()).thenReturn(connection);

        when(request.getParameter("password")).thenReturn("admin");
        when(request.getParameter("username")).thenReturn("admin");
        new LoginServlet().doPost(request,response);
        // verify(response).sendRedirect("/adminConsole.jsp");

        when(request.getParameter("password")).thenReturn("Rocky");
        when(request.getParameter("username")).thenReturn("123456");
        new LoginServlet().doPost(request,response);
    }
}
