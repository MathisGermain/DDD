package use_case;

import com.esgi.alasso.infrastructure.association.AssociationDao;
import com.esgi.alasso.infrastructure.factories.DaoFactory;
import com.esgi.alasso.infrastructure.role.RoleDao;
import com.esgi.alasso.infrastructure.role.UserRoleDao;
import com.esgi.alasso.infrastructure.utilisateur.UserDao;
import com.esgi.alasso.model.association.Association;
import com.esgi.alasso.model.role.Role;
import com.esgi.alasso.model.user.User;
import com.esgi.alasso.use_case.association.NewAssociation;
import com.esgi.alasso.use_case.role.NewRole;
import com.esgi.alasso.use_case.utilisateur.CreateUser;

public class NewCotisationTest {

    private UserDao userDao = DaoFactory.getUserDao();
    private AssociationDao associationDao = DaoFactory.getAssociationDao();
    private RoleDao roleDao = DaoFactory.getRoleDao();
    private UserRoleDao userRoleDao = DaoFactory.getUserRoleDao();

    public void test1 (){
        CreateUser createUser = new CreateUser(userDao,"BillyTheKid@gmail.com","Billy","TheKid");
        User admin = createUser.execute();

        NewAssociation newAssociation = new NewAssociation ("bénévoles", admin.getId(), associationDao, userDao);
        Association association = newAssociation.execute();

        NewRole roleMembre = new NewRole("member",association.getId(),roleDao,associationDao);
        Role member = roleMembre.execute();
        NewRole roleDefault = new NewRole("notMember",association.getId(),roleDao,associationDao);
        Role notMember = roleDefault.execute();

        CreateUser createUser2 = new CreateUser(userDao,"toto@gmail.com","tata","Yoyo");
        User user = createUser2.execute();

        



    }




}
