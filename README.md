ToastFromNonUIThread
====================
Android Code that demonstrates how to show Toast Msg from a non UI thread. 
This application is a very basic technique on how to show a toast message from a Non UI thread in Android.

Description
===========
I have tried to show a toast message in a non-ui thread i.e. in Run method of my timer which will obviously give error.
To solve the problem I passed a message from the Run method using Handler and used a Looper to add the 
non-ui task to the Main UI thread.

Using The Code for Demo
=======================
Just clone the repo and import the project to your eclipse as Android Application Project.
