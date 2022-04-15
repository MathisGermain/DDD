package use_case;

import com.esgi.alasso.infrastructure.factories.DaoFactory;
import com.esgi.alasso.infrastructure.utilisateur.UserDao;
import com.esgi.alasso.model.user.User;
import com.esgi.alasso.use_case.utilisateur.CreateUser;

public class NewCotisationTest {

    private UserDao userDao = DaoFactory.getUserDao();

    CreateUser createUser = new CreateUser(userDao,"BillyTheKid@gmail.com","Billy","TheKid");


}
