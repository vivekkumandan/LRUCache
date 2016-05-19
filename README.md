# LRUCache
LRU Cache implementation in java

Synopsis
----------------------------------------------------------------------------------
The project is an implementation of LRU Cache. LRU stands for Least Recently Used. 
It is simple yet powerful algorithm. Used Hash Map and Doubly Linked List to implement the Cache. 
The Hash Map is from Collections Framework of Java. 
Doubly Linked List is own implementation and limited to fulfil the requirement of my Cache. 
The first element of the doubly linked list is he least recently used element and last element of the doubly linked list is the most recently used. 
There is a limit that has to be set which specifies the capacity of the cache. 
When an element is used then it is added at end of the list. 
If it is already in the cache then it is moved to the end of the list. 
If the cache is full and a new element is added then the LRU element is removed to have space for the new element.
The main of the LRU has to be modified as required. LRUCache has three methods. 
Search is to search the key value pair in cache. Add is to add the key value pair to cache. 
Print is to print the cache in the order of Least Recently Used to Most Recently Used. 
The code works for capacity of cache greater than one.

Motivation
------------------------------------------------------------------------------------
Have implemented this project as a part of coding challenge during the process of my Full Time job search.

Installation
------------------------------------------------------------------------------------
Change the main of LRUCache as required by going through the comments there and run the application

Tests
------------------------------------------------------------------------------------
I have tested the code rigorously and found results to my satisfaction.
