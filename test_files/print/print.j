.class public Print
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
	.limit stack 4

	sipush 1
	sipush 2

	if_icmple Label1

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "THIS IS NOT LABEL 1"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

Label1:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "THIS IS LABEL 1"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
