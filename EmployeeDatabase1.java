import java.util.*;
/**
 * The EmployeeDatabase class is used
 * to construct an empty employee database to
 * store employees and their preferred
 * airport destinations
 *
 * @author Sunnie Grace McCalla
 */
public class EmployeeDatabase
{
    public EmployeeDatabase ()
        {
        employee = new ArrayList<>();  // destination to be done inside the employee class
        }

    private ArrayList<employee> employee;

    /** This method adds an employee with the given username e to the end of the database.
     * If an employee with the username e is already in the database, just return.
     * http://tutorials.jenkov.com/java/arrays.html#removing-elements-from-an-array
     */

      public static void addEmployee(String e)
/*      boolean testemployee = true; // This is what the TA told me to add
         for ( Employee i : employee )
          {
          if ( i.getUsername().equals(e) )  //access indv employees this way
             {
             testemployee = false;  //test boolean
             }

          if (testemployee == true)
             list.add(e);
          }*/
        int k=0;
        Iterator<employee> iter = items.iterator();
        while(iter.hasNExt())
        {
            employee current=iter.next();
            if (current.getUsername().equalsIgnoreCase(e))
            {
                k=1;    // this finds employee in the database
                return;
            }
        }
      }



/*    Iterator<String> iterator = list.iterator();
        while (iterator.hasNext());
                String value = iterator.next();

                for (String value : list);
                str e; if e is not in staff; list.add(e));
                else return;*/

      /** Add the given destination d to the wish list for employee e in the database.
      * If employee e is not in the database throw a java.lang.IllegalArgumentException.
      * If d is already in the wish list for employee e, just return.
      * @param e
      * @param d
      * Reference:
      * https://stackoverflow.com/questions/4404084/check-if-a-value-exists-in-arraylist
      */
      public void addDestination(String e, String d) throws IllegalArgumentException {
      /*boolean testemployee = true; //This is what the TA told me to add
        for ( Employee i : employee )
        {
            if ( i.getUsername().equals(e) )  //access indv employees this way
            {
               testemployee = true;  //test boolean
               i.getWishlist().add(d);
            }
            if ( i.getUsername().equals(e) )  //access indv employees this way
            {
               testemployee = false;  //test boolean
               throw new IllegalArgumentException();
            }
            // If employee e is not in the database throw a java.lang.IllegalArgumentException
         }*/
          int k = 0;
          int kk = 0;
          Iterator<employee> iter = items.iterator();
          while (iter.hasNext()) {
              employee current = iter.next();
              if (current.getUsername().equalsIgnoreCase(e)) { // you found employee
                  k = 1;
                  Iterator<String> itr = current.getWishlist().iterator(); // check all instances of destination
                  while (itr.hasNext()) {
                      String current2 = (String) itr.next();
                      if (current2.equalsIgnoreCase(d)) {
                          kk = 1;
                          return; // return when destination in employee's destination list
                      }
                      if (kk == 0) { // destination not already in list
                          current.getWishlist().add(d);  // add to the wishlist
                      }

                  }
              }
          }
      }
       /** Return true if and only if employee e is in the database.
        * @param e
        * @return
        */
      public boolean containsEmployee(String e) {
/*        boolean testemployee = true;
         for ( Employee i : employee )
         {
         if (i.getUsername().equals(e))  //access indv employees this way
            {
            testemployee = true;  //test boolean
            return true;    // add a print function here
            }

         return false;
         }*/
          Iterator<employee> iter = items.iterator();
          while (iter.hasNext()) {
              employee current = iter.next();
              if (current.getUsername().equals(e)) {
                  return true;
              }
          }
      }

        /** Return true if and only if destination d appears in at
         *least one employee's wish list in the database.
         */
        public boolean containsDestination(String d)
        {
            boolean testemployee = true;
            for ( Employee i : employee )

            {
                if (i.getUsername().equals(e))  //access indv employees this way
                {
                    testemployee = true;  //test boolean
                    return true;         // add a print function here
                }
        }
        }
        if (k==0) { // means employee was never found
            throw new IllegalArgumentException();
        }
        }
        }
    /****** Returns true if and only if destination d is in the
     * wish list for employee e. If employee e is not in the database, return false.
     *  similar to removeEmployee
    */
    public boolean hasDestination(String e, String d)
        {
        boolean result = false
           if (e == null && d == null)
                {
                result = false
                }
           else
               {
               result = true;
               }
        }

    /** Return the list of employees who have destination d in their wish list.
    *If destination d is not in the database, return a null list.
    */
    public List<String> getEmployees(String d)
        {
        if(lista.contains(conta1))
            {
                System.out.println(d);
            }
        }

    /** Return the wish list for the employee e. If an employee e is not in the database, return null.
    */
    public List<String> getDestinations(String e)
    {
        int pos = list.indexOf(e);
        System.out.println(e)
        else return null
    }

    /** Return an Iterator over the Employee objects in the database. The employees should be
    * returned in the order they were added to the database (resulting from the order in which
    * they are in the text file). https://stackoverflow.com/questions/37910401/how-to-return-an-arraylist-iterator-java
    */
    public Iterator<Employee> iterator()
    {
        return employee.iterattor();

    }

    /** Remove employee e from the database. If employee e is not in the database, return false;
    * otherwise (i.e., the removal is successful) return true.
    */
    public boolean removeEmployee(String e)
    boolean testemployee = true;
    {
        for ( Employee i : employee )
            {
                if ( i.getUsername().equals(e) )  //access indv employees this way
                {
                    testemployee = true;  //test boolean
                    list.remove(d);
                    return true
                }
                // If employee e is not in the database return false
            }

    /** Remove destination d from the database, i.e., remove destination d from every wish list
     * in which it appears. If destination d is not in the database, return false; otherwise
     * (i.e., the removal is successful) return true.
     */
    public boolean removeDestination(String d)
    boolean testemployee = true;
    {
        for ( Employee i : employee )
        {
            if ( i.getUsername().equals(e) )  //access indv employees this way
            {
                list.remove(d);
                return true
            }
    }

    /** Return the number of employees in this database.
    */
    public int size()
    {
        return employee.size()
    }
}
