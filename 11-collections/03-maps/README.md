# Maps

**Load factor**: Load factor is that threshold value which when crossed will double the hashmap’s capacity i.e. when you add 13th element in hashmap, the capacity will increase from 16 to 32

## HashMap

- permits `null` values and the `null` key
- no guarantees as to the order of the map
- add, remove, contains and size are constant time operations
- iterating is propertional to size + capacity
- implementation is not synchronized. can be synchronized by `Collections.synchronizedMap(map);`
- default initial capacity of 16, which means it has 16 buckets or bins to store map entries, each bucket is a singly linked list

## ConcurrentHashMap

- ConcurrentHashMap is internally divided into segments, by default size is 16 that means, at max 16 threads can work at a time
- Unlike HashTable, the entire map is not locked while reading/writing from the map
- For adding or updating the map, the lock is obtained on segment level. Not for reading.
- ConcurrentHashMap does not allow null keys or null values

## TreeMap

- does not allow `null` keys but it allows multiple `null` values
- elements are ordered using their natural ordering, or by a Comparator provided
- add, remove and contains are $\log{n}$ time operations
- iteration order maintained
- implementation is not synchronized. can be synchronized by `Collections.synchronizedSortedMap(treeMap)`
- TreeMap internally uses Red-Black tree based NavigableMap implementation

## LinkedHashMap
