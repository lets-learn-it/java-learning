# Data types

- **Primitive data types**
  - `byte`: 1 byte
  - `short`: 2 bytes
  - `int`: 4 bytes
  - `long`: 8 bytes
  - `float`: 4 bytes
  - `double`: 8 bytes
  - `boolean`: 1 byte
  - `char`: 2 byte (uses unicode)

## Access modifiers

- `default` (no keyword required): Accessible only within same package
- `public`: Accessible from everywhere in the program
- `private`: Any other class of same package will not be able to access. Top level classes or interfaces can not be declared as private.
- `protected`: Accessible within same package or subclasses in different packages.

## Non access modifiers

- `static`
  - _Used for_: Methods, variables, blocks & nested classess
  - _Meaning_: Belongs to class rather than instances
- `final`
  - _Used for_: Variables, methods, and classess
  - _Meaning_: Variables cannot be reassinged, method cannot be overridden, class cannot be subclassed
- `abstract`
  - _Used for_: Classes and methods
  - _Meaning_: Class cannot be instantiated; must be extended, method should not have body; must be implmented by subclass
- `synchronized`
  - _Used for_: methods or blocks
  - _Meaning_: Ensures only one thread accessed the method/block at a time (thread safe)
- `volatile`
  - _Used for_: Variables
  - _Meaning_: Prevent caching in CPU; ensures visibility of changes across threads.
- `transient`
  - _Used for_: Fields (class variables)
  - _Meaning_: Skips the variable during serialization
- `native`
  - _Used for_: Methods
  - _Meaning_: Declares a method implemented in native (non-java) code, usually C/C++.
