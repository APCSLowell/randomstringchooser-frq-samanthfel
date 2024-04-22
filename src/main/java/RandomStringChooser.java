import java.util.*;
public class RandomStringChooser
{
  private String[] ans;
  private int valuesRemaining;
  public RandomStringChooser(String[] vals){
    ans = new String[vals.length];
    for (int i =0; i<ans.length;i++)
      ans[i] = vals[i];
    valuesRemaining = ans.length;
  }
  public String getNext(){
    if (valuesRemaining ==0)
      return "NONE";
    int index = (int)(Math.random()*valuesRemaining);
    String selected = ans[index];
    ans[index]=ans[valuesRemaining-1];
    valuesRemaining--;
    return selected;
  }
}
