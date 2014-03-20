package com.acme.rewards.util;

import static java.lang.annotation.ElementType.*;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;


@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD, FIELD, TYPE,PARAMETER})
public @interface Rewards {

}
