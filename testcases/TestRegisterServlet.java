import com.arun.DBConnection;
import com.arun.RegisterServlet;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestRegisterServlet {

    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;

    @Before
    public void setUp() throws Exception {
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

        when(request.getParameter("username")).thenReturn("demo");
        when(request.getParameter("email")).thenReturn("demo@demo.com");
        when(request.getParameter("password")).thenReturn("123456");

        new RegisterServlet().doPost(request,response);
    }

}
