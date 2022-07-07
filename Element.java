/**
 * Element Class
 *
 * @author bear
 * @version 13/05/2022
 */
public class Element<E>
{
    E name;
    Element follower;

    public Element(E name){
        this.name = name;
    }

    public void setName(E name){
        this.name = name; 
    }

    public void setFollower(Element follower){
        this.follower=follower;
    }
}