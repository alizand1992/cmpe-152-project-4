.class public AddExpr
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 4
    .limit locals 3

    ldc2_w 10.1
    ldc2_w 32
    ladd

    lstore 1

    getstatic java/lang/System/out Ljava/io/PrintStream;
    lload 1
    invokevirtual java/io/PrintStream/println(J)V

    return
.end method
