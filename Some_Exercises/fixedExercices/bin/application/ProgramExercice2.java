????   > q  application/ProgramExercice2  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lapplication/ProgramExercice2; main ([Ljava/lang/String;)V	    java/util/Locale   US Ljava/util/Locale;
     
setDefault (Ljava/util/Locale;)V  java/util/Scanner	    java/lang/System   ! in Ljava/io/InputStream;
  #  $ (Ljava/io/InputStream;)V & entities/Employee
 % 		  ) * + out Ljava/io/PrintStream; - Name: 
 / 1 0 java/io/PrintStream 2 3 println (Ljava/lang/String;)V
  5 6 7 nextLine ()Ljava/lang/String;	 % 9 : ; name Ljava/lang/String; = Gross Salary: 
  ? @ A 
nextDouble ()D	 % C D E GrossSalary D G Tax: 	 % I J E Tax L java/lang/StringBuilder N 
Employee: 
 K P  3
 K R S T append -(Ljava/lang/Object;)Ljava/lang/StringBuilder;
 K V W 7 toString
 / Y 2  [ %Which percentage to increase salary? 
 / ] ^ 3 print
 % ` a b IncreaseSalary (D)V d Updated data: 
  f g  close args [Ljava/lang/String; sc Ljava/util/Scanner; emp Lentities/Employee; 
percentage 
SourceFile ProgramExercice2.java !               /     *? ?    
                    	           ?? ? ? Y? ? "L? %Y? 'M? (,? .,+? 4? 8? (<? .,+? >? B? (F? .,+? >? H? (? KYM? O,? Q? U? .? (? X? (Z? \+? >J,)? _? (? KYc? O,? Q? U? .+? e?    
   F           !  )  1  9  A  I  _  e  m  r  w  ?   ? "    *    ? h i    ? j k   y l m  r   n E   o    p