# cmpe-152-project-4

place the code in test_files/print/print.lala
Compile from the project directory by `javac -cp antlr-4.7.1-complete.jar gen/com/main/*.java src/com/main/*.java src/com/main/grammar/*.java -d out/production/cmpe-152-project-4/`
cd into the cmpe-152-project-4 directory in out:
example: `~/Documents/cmpe-152-project-4 $ cd out/production/cmpe-152-project-4/`
run by `java -cp ".:../../../antlr-4.7.1-complete.jar" com.main.Main`


example:
```
ali@lala-land (master) (dirty) 2019-12-05 17:29:19
~/Documents/cmpe-152-project-4/out/production/cmpe-152-project-4 $ java -cp ".:../../../antlr-4.7.1-complete.jar" com.main.Main
Please enter a path to a test file:
../../../test_files/print/print.lala
-----===== PARSE USING LISTENER =====-----
v=-2.6;
printv;
printtest;
{intv;v=-2.6;printv;printtest;}
test=2+1+3;
test=test+2.4-3.7;
printtest;




-----===== jASMin =====-----
.class public Print
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
	.limit stack 14
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

return
.end method
```

then follow the following:

```
~/Documents/cmpe-152-project-4/out/production/cmpe-152-project-4 $ java -cp ".:../../../antlr-4.7.1-complete.jar" com.main.Main
Please enter a path to a test file:
../../../test_files/print/print.lala
-----===== PARSE USING LISTENER =====-----
v=-2.6;
printv;
printtest;
{intv;v=-2.6;printv;printtest;}
test=2+1+3;
test=test+2.4-3.7;
printtest;




-----===== jASMin =====-----
.class public Print
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
	.limit stack 14
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

return
.end method
The j file is at: ../../../test_files/print/print.j
ali@lala-land (master) (dirty) 2019-12-05 17:33:45
~/Documents/cmpe-152-project-4/out/production/cmpe-152-project-4 $ java -jar ../../../jasmin.jar ../../../test_files/print/print.j
Generated: Print.class
ali@lala-land (master) (dirty) 2019-12-05 17:34:27
~/Documents/cmpe-152-project-4/out/production/cmpe-152-project-4 $ ls
META-INF	Print.class	com		test_files
ali@lala-land (master) (dirty) 2019-12-05 17:34:31
~/Documents/cmpe-152-project-4/out/production/cmpe-152-project-4 $ java Print.class
Error: Could not find or load main class Print.class
ali@lala-land (master) (dirty) 2019-12-05 17:34:37
~/Documents/cmpe-152-project-4/out/production/cmpe-152-project-4 $ java Print
-2.6
NULL
4.700000047683716
ali@lala-land (master) (dirty) 2019-12-05 17:34:40
~/Documents/cmpe-152-project-4/out/production/cmpe-152-project-4 $
```
