 import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddUserComponent } from './add-user/add-user.component';
import { DeleteUserComponent } from './delete-user/delete-user.component';
import { GetUserComponent } from './get-user/get-user.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { UpdateUserComponent } from './update-user/update-user.component';

const routes: Routes = [
  {
    path:'',
    component: GetUserComponent
  },

  {
    path:'getuser',
    component:GetUserComponent
  },

  {
    path:'adduser',
    component: AddUserComponent
  },

  {
    path:'deleteuser',
    component: DeleteUserComponent
  },

  {
    path:'updateuser',
    component: UpdateUserComponent
  },

  {
    path:'**',
    pathMatch: 'full',
    component: PageNotFoundComponent
  }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
