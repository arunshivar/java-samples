import com.arun.LoginServlet;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TestLoginServlet extends TestCase{

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

        when(request.getParameter("user")).thenReturn("admin");
        when(request.getParameter("password")).thenReturn("admin");
        PreparedStatement preparedStatement = mock(PreparedStatement.class);
        ResultSet resultSet = mock(ResultSet.class);
        when(preparedStatement.executeQuery()).thenReturn(resultSet);
        when(resultSet.next()).thenReturn(true);
        when(resultSet.getString("role")).thenReturn("admin");
        new LoginServlet().doPost(request,response);
    }

    }
