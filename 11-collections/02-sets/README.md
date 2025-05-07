# Sets

## HashSet

- backed by a hash table (actually a HashMap instance)
- iteration order not guaranteed
- permits the `null` element
- add, remove, contains and size are constant time operations
- iterating is propertional to size + capacity
- implementation is not synchronized

## TreeSet

- internally uses TreeMap
- does not allow `null` elements
- elements are ordered using their natural ordering, or by a Comparator provided
- add, remove and contains are $\log{n}$ time operations
- iteration order maintained
- implementation is not synchronized

## LinkedHashSet

-
