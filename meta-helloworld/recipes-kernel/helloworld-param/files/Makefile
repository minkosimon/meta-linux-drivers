obj-m += hello_world_param.o
 
SRC := $(shell pwd)

all:
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC) modules

modules_install:
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC) modules_install
clean:
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC) clean