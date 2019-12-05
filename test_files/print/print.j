.class public Print
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
	.limit stack 18
	.limit locals 8


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "-2.6"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "NULL"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

	ldc2_w 2
	ldc2_w 1
	ladd
	lstore 1

	lload 1
	ldc2_w 3
	ladd
	lstore 2

	lload 2
	l2d
	ldc2_w 2.4
	dadd

	dstore 3

	dload 3
	ldc2_w 3.7
	dsub

	dstore 4


	getstatic java/lang/System/out Ljava/io/PrintStream;
	dload 4
	invokevirtual java/io/PrintStream/println(D)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "1"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V


	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "0"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

return
.end method