LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE :=hello

LOCAL_SRC_FILES =: com_example_administrator_myndkceshi_HelloJni.c
include $(BUILD_SHARED_LIBRARY)
