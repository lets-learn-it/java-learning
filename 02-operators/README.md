# Operators

| Category       | Operator(s)      | Meaning                        | Example                        |
| -------------- | ---------------- | ------------------------------ | ------------------------------ |
| **Arithmetic** | `+`              | Addition                       | `a + b`                        |
|                | `-`              | Subtraction                    | `a - b`                        |
|                | `*`              | Multiplication                 | `a * b`                        |
|                | `/`              | Division                       | `a / b`                        |
|                | `%`              | Modulus (remainder)            | `a % b`                        |
| **Unary**      | `+`              | Unary plus                     | `+a`                           |
|                | `-`              | Unary minus                    | `-a`                           |
|                | `++`             | Increment                      | `a++` or `++a`                 |
|                | `--`             | Decrement                      | `a--` or `--a`                 |
|                | `!`              | Logical NOT                    | `!flag`                        |
|                | `~`              | Bitwise complement             | `~a`                           |
| **Assignment** | `=`              | Assign value                   | `a = 10`                       |
|                | `+=`, `-=`, etc. | Compound assignment            | `a += 5` (same as `a = a + 5`) |
| **Relational** | `==`             | Equal to                       | `a == b`                       |
|                | `!=`             | Not equal to                   | `a != b`                       |
|                | `>`              | Greater than                   | `a > b`                        |
|                | `<`              | Less than                      | `a < b`                        |
|                | `>=`             | Greater than or equal to       | `a >= b`                       |
|                | `<=`             | Less than or equal to          | `a <= b`                       |
| **Logical**    | `&&`             | Logical AND                    | `a > 0 && b > 0`               |
|                | `\|`             | Logical OR                     | `a > 0 \|\| b > 0`             |
|                | `!`              | Logical NOT                    | `!true`                        |
| **Bitwise**    | `&`              | Bitwise AND                    | `a & b`                        |
|                | `\|`             | Bitwise OR                     | `a \| b`                       |
|                | `^`              | Bitwise XOR                    | `a ^ b`                        |
|                | `~`              | Bitwise complement             | `~a`                           |
|                | `<<`             | Left shift                     | `a << 2`                       |
|                | `>>`             | Signed right shift             | `a >> 2`                       |
|                | `>>>`            | Unsigned right shift           | `a >>> 2`                      |
| **Ternary**    | `? :`            | Conditional (if-else shortcut) | `max = (a > b) ? a : b;`       |
| **Type Test**  | `instanceof`     | Checks object type             | `obj instanceof String`        |
| **Type Cast**  | `(type)`         | Casts one type to another      | `int x = (int) 10.5;`          |
