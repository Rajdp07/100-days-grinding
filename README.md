# 100-days-grinding
#Topic- Exception Handling in JAVA
#Demo programs with TRY, CATCH, FINALLY blocks
............................................................................
Exceptions
Three types:

Checked Exceptions: Notified by the compiler at compile-time
Unchecked Exceptions: Runtime Exceptions
Errors: Problems that arise beyond the control of the user and programmer, e.g. stack overflow
Exception Hierarchy
alt text

alt text

try-with-resources
Automatically closes the resources used, e.g.

try (FileReader fr = new FileReader(filepath)) {
    // use the resource
} catch () {
    // handle the exception
}
User-defined Exceptions
Must be a child of Throwable
If checked exception, must extend Exception
If unchecked exception, must extend RuntimeException
