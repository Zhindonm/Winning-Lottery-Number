/*Three objects group into a Triple
*/
public class Pair<FirstType, SecondType>
{
  /*The three objects
  */
  private final FirstType first;
  private final SecondType second;

  /*Constructor
  */
  public Pair(FirstType requiredFirst, SecondType requiredSecond)
  {
    first = requiredFirst;
    second = requiredSecond;
  }

  /*Return the first object
  */
  public FirstType getFirst()
  {
    return first;
  }

  /*Return the second object
  */
  public SecondType getSecond()
  {
    return second;
  }
}
