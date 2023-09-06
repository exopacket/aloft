# aloft

A programming language for full stack development with simple object oriented syntax.

This is a side project. Don't intend on it being done anytime soon. Feel free, if you're interested in the idea, to pass along ideas or contributions. Missing some syntax. Based around the simple_language_plugin sample for IntelliJ. Using the case-sensitive version speeds up syntax highlighting and verification by a ton.

![icon](https://github.com/exopacket/aloft/blob/main/aloft_icon_sm.png)

# progress

I have began work on the aloft-server and aloft-cli. Both will be written 100% in Java. The server will run as a daemon and serve content in place of apache or nginx (still deciding on this, but the most likely route). There will be no build process this way and the aloft files alone will make up the application. Speed and performance is TBD, but a priority. <b>Feature Update: </b>Aloft will now *build* mobile applications using Flutter. A little odd since there's two build processes, but the easiest and quickest way forward to release. 

# features

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
  - Case insensitivity for keywords and types
  - generates complete HTML, CSS, PHP, and Javascript files / or serves HTML file to client
