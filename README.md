# SimpleCuda
A simple project to demonstrate using dl4j with a cuda backend

## Notes
1. install cuda - https://docs.nvidia.com/cuda/cuda-installation-guide-linux/index.html
2. check nvcc version (should be release 10.1 for this repo)

```
> nvcc --version
nvcc: NVIDIA (R) Cuda compiler driver
Copyright (c) 2005-2019 NVIDIA Corporation
Built on Sun_Jul_28_19:07:16_PDT_2019
Cuda compilation tools, release 10.1, V10.1.243
```

3. set dependencies right (check build.sbt)