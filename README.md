# HorizontalDistance
Find the horizontal distance of two nodes which exists at same height

Class SokratiTree:
	Have 3 properties named as
		1) value
		2) leftChild
		3) rightChild
		
Class SokratiQueue:
	Basic utility class for providing the Queue functionality for tracing the tree in Breadth First Approach

Static Input Data: 
	1) Crate and store the N number of references of SokratiTree as required in Demo.java file
	2) Map each one of the SokratiTree nodes with each other as required using one of the two methods
		i)SokratiTree.setLeftChild(SokratiTree);
		ii) SokratiTree.setRightChild(SokratiTree);

Static Input Data Rules:
	No two nodes should have the same value
	
Runtime Input Data:
	Code will ask for the two values for the nodes for which horizontal distance is to be calculated
	Only Integer value should be entered. Entering other type of data will result in code crash
	
Runtime Output:
	Code will print
		i) If the height of both the provided node value are same, then code will print the horizontal distance between the two
		ii) If height of both the provided node values are not same, then code will show the message on console as "Provided elements don't exists on the same level".
