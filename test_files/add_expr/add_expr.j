.class public AddExpr
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 3
    .limit locals 2

    sipush 1
    sipush 2
    iadd
    istore 1

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    invokevirtual java/io/PrintStream/println(I)V

    return
.end method
