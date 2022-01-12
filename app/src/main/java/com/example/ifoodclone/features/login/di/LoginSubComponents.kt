package com.example.ifoodclone.features.login.di

import dagger.Module

//The "subcomponents" attribute in the @Module annotation tells Dagger what
// Subcomponents are children of the Component this module is included in.

@Module(subcomponents = [LoginComponent::class])
class LoginSubComponents {
}