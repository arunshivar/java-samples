import com.arun.CheckUserName;
import com.arun.DBConnection;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.when;

public class TestCheckUserName {


    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;

    @Mock
    RequestDispatcher requestDispatcher;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test() throws Exception {

        PreparedStatement preparedStatement = mock(PreparedStatement.class);
        Connection connection = mock(Connection.class);
        ResultSet resultSet = mock(ResultSet.class);
        PrintWriter out = mock(PrintWriter.class);
        when(preparedStatement.executeQuery()).thenReturn(resultSet);

        DBConnection dbConnection = mock(DBConnection.class);
        when(dbConnection.getConnection()).thenReturn(connection);
        when(response.getWriter()).thenReturn(out);

        when(request.getParameter("q")).thenReturn("rocko");
        new CheckUserName().doGet(request,response);

        when(request.getParameter("q")).thenReturn("admin");
        new CheckUserName().doGet(request,response);
    }

}
