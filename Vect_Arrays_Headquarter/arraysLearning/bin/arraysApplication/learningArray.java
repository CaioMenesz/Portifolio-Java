ΚώΊΎ   > ΐ  arraysApplication/learningArray  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this !LarraysApplication/learningArray; main ([Ljava/lang/String;)V  java/util/ArrayList
  	  Maria    java/util/List   add (Ljava/lang/Object;)Z  Alex  Bob   Anna " Marco  $  % (ILjava/lang/Object;)V ' Arnold	 ) + * java/lang/System , - out Ljava/io/PrintStream;  / 0 1 size ()I
 3 5 4 java/io/PrintStream 6 7 println (I)V  9 : ; iterator ()Ljava/util/Iterator; = ? > java/util/Iterator @ A next ()Ljava/lang/Object; C java/lang/String
 3 E 6 F (Ljava/lang/String;)V = H I J hasNext ()Z L ----------------------------  N O P remove (I)Ljava/lang/Object;   R S T test  ()Ljava/util/function/Predicate;  V W X removeIf !(Ljava/util/function/Predicate;)Z Z java/lang/StringBuilder \ Index of Marco: 
 Y ^  F  ` a b indexOf (Ljava/lang/Object;)I
 Y d e f append (I)Ljava/lang/StringBuilder;
 Y h i j toString ()Ljava/lang/String; l Index of Bob:   n o p stream ()Ljava/util/stream/Stream;  R s u t java/util/stream/Stream v w filter 9(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
 y { z java/util/stream/Collectors | } toList ()Ljava/util/stream/Collector; s    collect 0(Ljava/util/stream/Collector;)Ljava/lang/Object;  R s    	findFirst ()Ljava/util/Optional;
    java/util/Optional   orElse &(Ljava/lang/Object;)Ljava/lang/Object; args [Ljava/lang/String; list Ljava/util/List; x Ljava/lang/String; result name LocalVariableTypeTable $Ljava/util/List<Ljava/lang/String;>; StackMapTable  lambda$0 (Ljava/lang/String;)Z
 B    charAt (I)C lambda$1 lambda$2 
SourceFile learningArray.java BootstrapMethods
 ₯ § ¦ "java/lang/invoke/LambdaMetafactory ¨ © metafactory Μ(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; € 
  ­   ¬  
  ²   ±  
  ·    Ά  InnerClasses Ό %java/lang/invoke/MethodHandles$Lookup Ύ java/lang/invoke/MethodHandles Lookup !               /     *· ±    
                    	          h» Y· L+Ή  W+Ή  W+Ή  W+Ή  W+!Ή # +&Ή  W² (+Ή . Ά 2+Ή 8 N§ -Ή < ΐ BM² (,Ά D-Ή G ?ι² (KΆ D+Ή M W+Ί Q  Ή U W+Ή 8 N§ -Ή < ΐ BM² (,Ά D-Ή G ?ι² (KΆ D² (» YY[· ]+!Ή _ Ά cΆ gΆ D² (» YYk· ]+Ή _ Ά cΆ gΆ D² (KΆ D+Ή m Ί q  Ή r Έ xΉ ~ ΐ M,Ή 8 :§ Ή < ΐ BN² (-Ά DΉ G ?η² (KΆ D+Ή m Ί   Ή r Ή  Ά ΐ BN² (-Ά D±    
   v    
       #  ,  5  >  J  ^  e  n  v  ~      ₯  ? ! Ά " Σ # π % ψ ' )* *1 ); -C /` 0g 1    H   h     `    ^          T   *    `          `    T       + ? T     =  .? y      =  
       E     *Ά B  § ¬    
                        @
       E     *Ά A  § ¬    
       '                 @
        E     *Ά A  § ¬    
       /                 @  ‘    ’ £      ͺ  « ? ― ͺ  ° ³ ΄ ͺ  ΅ Έ Ή Ί   
  » ½ Ώ 