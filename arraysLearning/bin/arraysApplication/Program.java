����   > �  arraysApplication/Program  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LarraysApplication/Program; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	    java/util/Locale    US Ljava/util/Locale;
  " # $ 
setDefault (Ljava/util/Locale;)V & java/util/ArrayList
 % 		  ) * + out Ljava/io/PrintStream; - &How much employes will be registered? 
 / 1 0 java/io/PrintStream 2 3 println (Ljava/lang/String;)V
  5 6 7 nextInt ()I
 / 9 2  ; java/lang/StringBuilder = 
Employee #
 : ?  3
 : A B C append (I)Ljava/lang/StringBuilder; E : 
 : G B H -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 : J K L toString ()Ljava/lang/String; N Id: 
 / P Q 3 print S Name: 
  U V L nextLine X Salary: 
  Z [ \ 
nextDouble ()D ^ entities/Employee
 ` b a java/lang/Integer c d valueOf (I)Ljava/lang/Integer;
 f h g java/lang/Double c i (D)Ljava/lang/Double;
 ] k  l :(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)V n p o java/util/List q r add (Ljava/lang/Object;)Z t :Enter the employee id that will have the salary increase:  n v w x stream ()Ljava/util/stream/Stream;   z { | test !(I)Ljava/util/function/Predicate; ~ �  java/util/stream/Stream � � filter 9(Ljava/util/function/Predicate;)Ljava/util/stream/Stream; ~ � � � 	findFirst ()Ljava/util/Optional;
 � � � java/util/Optional � � orElse &(Ljava/lang/Object;)Ljava/lang/Object; � That id does not exist! � Enter the pecentage: 
 ] � � � increaseSalary (D)V � 
List of employees:  n � � � iterator ()Ljava/util/Iterator; � � � java/util/Iterator � � next ()Ljava/lang/Object;
 / � 2 � (Ljava/lang/Object;)V � � � � hasNext ()Z
  � �  close args [Ljava/lang/String; sc Ljava/util/Scanner; list Ljava/util/List; N I line id employee Ljava/lang/String; salary D emp Lentities/Employee; idsalary 
percentage obj LocalVariableTypeTable %Ljava/util/List<Lentities/Employee;>; StackMapTable � lambda$0 (ILentities/Employee;)Z
 ] � � � getId ()Ljava/lang/Integer;
 ` � � 7 intValue x 
SourceFile Program.java BootstrapMethods
 � � � "java/lang/invoke/LambdaMetafactory � � metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; � r
  � � � � (Lentities/Employee;)Z � InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup !               /     *� �    
       
             	      �  
  /� Y� � L� � !� %Y� 'M� (,� .+� 4>6� w� (� 8� (� :Y<� >`� @D� F� I� .� (M� O+� 46� (R� O+� TW+� T:� (W� O+� Y9� ]Y� _� e� j:	,	� m W����� (s� .+� 46,� u � y  � } � � � �� ]:� � (�� .� � (�� .+� Y9� �� (�� .,� � :� � � � ]:� (� �� � ���+� ��    
   � !          !  &  ,  2  P  X  ^  f  k  q  y   ! � # �  � & � ' � ) � + � , � - � . � / � 0 � 3 4 5  4* 8. :    �   / � �   $ � �   � �  &	 � �  ) } � �  ^ ? � �  q , � �    � �  � 	 � � 	 � { � �  � [ � �  �  � �   � �  �      � �  �   8 � ,  �  n  � s� C ]�   �  n ]  �  
 � �     F     +� Ķ �� � �    
       )         � �  �    @  �    � �     �  � � � �   
  � � � 