# Data-Structures-Excercises

Excercise 1:

Create a class called Movies.java.
Create an empty linked list called movies. The choice of console or GUI is up to you.
Provide a choice for the user to add, edit, or delete items from your linked list.
As each movie name is provided, add it to a Linked List and display the elements of the list to the user before prompting for the next action. If they choose delete, display the list and prompt the user to choose a movie to delete by index. Delete that movie from the linked list and display the new list. If they choose edit, display the list of movies names and have the user select one to edit.
Prompt for the edited name, then replace the old name with the new name in the linked list.
Re-display the new linked list.

Exercise 2:

Create a class called Restaurant.java.
Create an empty stack called seating.
Prompt the user for their name to ask for a table.
Add the user's name to the seating stack.
Display a message to the user informing them of how long the wait time will be. (You can hard code the same amount of time, or you can be creative and generate a random amount of time).
Prompt the user for whether they would like to wait for a table or whether it is too long and they would like to be removed from the list. If they want to be removed, use stack methods to remove that user's name from the list. (NOTE: Think about this. Although stacks work perfect for this exact scenario, it might not be ideal for the entire seating system because you would need to seat the last person who checked in first so that you could remove them from the list.)

Exercise 3:

Create a class called DMV.java. Think of the user for this application as the receptionist.
Create an empty queue called license.
Give the receptionist(user) choices of whether to enter a new person into the waiting list or whether to call the next person who is waiting. If the user chooses to add a new person, prompt for the person's name and add the person to the Tail of the queue. If the user chooses to call the next person, first check to see if the queue is empty. If the queue is empty, tell the receptionist there are no customers so they can go home. If the queue is not empty, remove the person from the Head of the queue and give the receptionist the person's name to call.
