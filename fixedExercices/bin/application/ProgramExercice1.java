����   > c  application/ProgramExercice1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lapplication/ProgramExercice1; main ([Ljava/lang/String;)V	    java/util/Locale   US Ljava/util/Locale;
     
setDefault (Ljava/util/Locale;)V  java/util/Scanner	    java/lang/System   ! in Ljava/io/InputStream;
  #  $ (Ljava/io/InputStream;)V & entities/Rectangle
 % 		  ) * + out Ljava/io/PrintStream; - "Enter rectangle width and height: 
 / 1 0 java/io/PrintStream 2 3 println (Ljava/lang/String;)V
  5 6 7 
nextDouble ()D	 % 9 : ; width D	 % = > ; height @ AREA = %.2f

 % B C 7 area
 E G F java/lang/Double H I valueOf (D)Ljava/lang/Double;
 / K L M printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream; O PERIMITER = %.2f

 % Q R 7 	perimiter T DIAGONAL = %.2f

 % V W 7 diagonal
  Y Z  close args [Ljava/lang/String; sc Ljava/util/Scanner; rect Lentities/Rectangle; 
SourceFile ProgramExercice1.java !               /     *� �    
                    	       �     {� � � Y� � "L� %Y� 'M� (,� .,+� 4� 8,+� 4� <� (?� Y,� A� DS� JW� (N� Y,� P� DS� JW� (S� Y,� U� DS� JW+� X�    
   .           !  )  1  H  _  v  z          { [ \    j ] ^   b _ `   a    b