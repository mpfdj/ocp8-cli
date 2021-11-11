// When you want to use Date from 2 different packages
// You can pick 1 to use in the import statement
// And use the other's fully qualified class name

import java.util.Date;

public class Conflicts {

    Date date;
    java.sql.Date sqlDate;


}
