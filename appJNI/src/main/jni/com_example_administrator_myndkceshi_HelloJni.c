#include "com_example_administrator_myndkceshi_HelloJni.h"



JNIEXPORT jint JNICALL
Java_com_example_administrator_myndkceshi_HelloJni_HelloWord(JNIEnv *env, jobject instance, jint a) {

        if (a >10) {
            return 100;
        }

        if(a<10){
            return 300;
        }

    return 400;
}