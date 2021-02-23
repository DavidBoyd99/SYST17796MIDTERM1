package midtermreviewcodeforpartc;

/**
 *
 * @author david
 */
public class UserNameValidator extends User{
    
    public boolean isValid(User user)
    {
        return !(user.getName().isEmpty()); // If name is empty, will return False
    }
    
}


