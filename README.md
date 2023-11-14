# aloft

A programming language for full stack development with simple object oriented syntax.

![icon](https://github.com/exopacket/aloft/blob/main/aloft_icon_sm.png)

# progress

I have began work on the aloft-server and aloft-cli. Both will be written 100% in Java. The server will run as a daemon and serve content in place of apache or nginx.. Speed and performance is TBD, but a priority. There's some weird algos in the code.. Just ignore them; they're for internal use only.

# security

Security is of upmost importance with aloft. Sites and modules will be bundled in signed jars called 'cans' which will be loaded dynamically at runtime into the server. They will not allow any extended java classes other than the predefined classes for the aloft library package. The server runs in a jailed environment (as root) where capability to damage the system is minimized.  

# features

<b>These features are fairly old and basic. As this project progresses, expect changes to syntax and features.</b>

  - Object oriented focus with custom classes
  - Mutiple object types (component, element, theme, model, page, animation, module, query, and callable) to define the different parts of your web application
  - Dynamic types for variables, arrays, and data objects similar to Javascript and PHP. Either define the type or don't.
  - 'update' function return type for updating the user interface
  - Constructor parameters for data models and classes are understood by creating a required variable beginning with an astersik `*myRequiredVariable`
  - Variables in data models have an optional mapping to database table's column name
  - Both named queries for multiple uses across files and inline queries
  - Static variables and functions are created with two colons at the beginning of the name `::myStaticVariable`
  - Private variables and functions are created by enclosing the name in parenthesis `(myPrivateVariable)`
  - Create and set multiple variables on a single line `::(myVariable1, myVariable2 = 0, myVariable3)`
  - A single loop type (`repeat`) for do while, while, for, and foreach loops.
  - API can be created alongside your other code, or call an external API
  - Callable object type that can be used for client side code, api calls, or general server side logic
  - Defined animations
  - Framework modules for things like cryptography, different database types, and cookie/session/login logic)
  - Forgiving data types (int/integer, bool/boolean, time("format"))
  - Optional semicolon
