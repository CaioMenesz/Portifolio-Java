????   > M  entities/Employee  java/lang/Object id Ljava/lang/Integer; employee Ljava/lang/String; salary Ljava/lang/Double; <init> :(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)V Code
     ()V	    	    	   	 
 LineNumberTable LocalVariableTable this Lentities/Employee; getId ()Ljava/lang/Integer; 
getEmploye ()Ljava/lang/String; 
setEmploye (Ljava/lang/String;)V employe 	getSalary ()Ljava/lang/Double; increaseSalary (D)V
 ' ) ( java/lang/Double * + doubleValue ()D@Y      
 ' / 0 1 valueOf (D)Ljava/lang/Double; 
percentage D toString 6 java/lang/StringBuilder
 5 
 5 9 : ; append -(Ljava/lang/Object;)Ljava/lang/StringBuilder; = , 
 5 ? : @ -(Ljava/lang/String;)Ljava/lang/StringBuilder; B %.2f
 D F E java/lang/String G H format 9(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
 5 J 4  
SourceFile Employee.java !                 	 
           l     *? *+? *,? *-? ?           	  
 	         *                        	 
         /     *? ?                               /     *? ?                                >     *+? ?       
                      !    " #     /     *? ?                         $ %     U     *Y? ? &*? ? &'k ,oc? .? ?       
                      2 3   4      `     6? 5Y? 7*? ? 8<? >*? ? ><? >A? Y*? S? C? >? I?           !        6      K    L