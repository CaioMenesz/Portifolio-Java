����   > D  entities/Employee  java/lang/Object name Ljava/lang/String; GrossSalary D Tax <init> ()V Code
   
  LineNumberTable LocalVariableTable this Lentities/Employee; 	NetSalary ()D	    	   	  IncreaseSalary (D)V@Y       
percentage toString ()Ljava/lang/String; ! java/lang/StringBuilder	  #  
 % ' & java/lang/String ( ) valueOf &(Ljava/lang/Object;)Ljava/lang/String;
   + 
 , (Ljava/lang/String;)V . , $
   0 1 2 append -(Ljava/lang/String;)Ljava/lang/StringBuilder; 4 %.2f
  6  
 8 : 9 java/lang/Double ( ; (D)Ljava/lang/Double;
 % = > ? format 9(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   A   
SourceFile Employee.java !                 	      
      /     *� �                               4     
*� *� g�           
        
            L     *Y� *� 'k oc� �       
                                c     -�  Y*� "� $� *-� /3� Y*� 5� 7S� <� /� @�                )         -      B    C