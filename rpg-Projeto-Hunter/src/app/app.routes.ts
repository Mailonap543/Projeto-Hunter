import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// 🚨 Você precisará criar o componente HomeScreenComponent
// Por agora, vamos apenas importá-lo para que o roteamento funcione
// import { HomeScreenComponent } from './pages/home-screen/home-screen.component'; // DESCOMENTE QUANDO CRIAR A TELA

const routes: Routes = [
  // {
  //   path: '',
  //   component: HomeScreenComponent, // Rota padrão para a Tela Inicial do Jogo
  // },
  // {
  //   path: 'mapa/:regiao', 
  //   loadChildren: () => import('./pages/map-screen/map-screen.module').then(m => m.MapScreenModule)
  // },
  {
    path: 'modulos',
    loadChildren: () => import('./remote-entry/remote-entry.module').then(m => m.RemoteEntryModule),
  },
  // { path: '**', redirectTo: '' } 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }