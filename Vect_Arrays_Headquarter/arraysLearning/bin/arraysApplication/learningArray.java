Êþº¾   > À  arraysApplication/learningArray  java/lang/Object <init> ()V Code
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
 ¥ § ¦ "java/lang/invoke/LambdaMetafactory ¨ © metafactory Ì(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; ¤ 
  ­   ¬  
  ²   ±  
  ·    ¶  InnerClasses ¼ %java/lang/invoke/MethodHandles$Lookup ¾ java/lang/invoke/MethodHandles Lookup !               /     *· ±    
                    	          h» Y· L+¹  W+¹  W+¹  W+¹  W+!¹ # +&¹  W² (+¹ . ¶ 2+¹ 8 N§ -¹ < À BM² (,¶ D-¹ G ÿé² (K¶ D+¹ M W+º Q  ¹ U W+¹ 8 N§ -¹ < À BM² (,¶ D-¹ G ÿé² (K¶ D² (» YY[· ]+!¹ _ ¶ c¶ g¶ D² (» YYk· ]+¹ _ ¶ c¶ g¶ D² (K¶ D+¹ m º q  ¹ r ¸ x¹ ~ À M,¹ 8 :§ ¹ < À BN² (-¶ D¹ G ÿç² (K¶ D+¹ m º   ¹ r ¹  ¶ À BN² (-¶ D±    
   v    
       #  ,  5  >  J  ^  e  n  v  ~      ¥  ® ! ¶ " Ó # ð % ø ' )* *1 ); -C /` 0g 1    H   h     `    ^          T   *    `          `    T       + ÿ T     =  .ÿ y      =  
       E     *¶ B  § ¬    
                        @
       E     *¶ A  § ¬    
       '                 @
        E     *¶ A  § ¬    
       /                 @  ¡    ¢ £      ª  « ® ¯ ª  ° ³ ´ ª  µ ¸ ¹ º   
  » ½ ¿ 