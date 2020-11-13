package com.app3null.basestructure.usecases

abstract class BaseUseCaseWithRepo<REPOSITORY, ARG_TYPE, RETURN_TYPE>
constructor(protected val repository: REPOSITORY) :
    BaseUseCase<ARG_TYPE, RETURN_TYPE>