/**
 * Element Class
 *
 * @author bear
 * @version 13/05/2022
 */
public class Element<E>
{
    boolean students;
    int cometime;
    Element follower;
   

    public Element(boolean isStudent,int time){
        this.students =isStudent;
        this.cometime=time;
    }

   

    public void setFollower(Element follower){
        this.follower=follower;
    }
}