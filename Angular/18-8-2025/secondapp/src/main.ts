import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Listcom } from './app/listcom/listcom';
import { Conditioncom } from './app/conditioncom/conditioncom';
import { Switchdemo } from './app/switchdemo/switchdemo';
import { Searchfilter } from './app/searchfilter/searchfilter';
import { Home } from './app/home/home';

bootstrapApplication(Home,appConfig)
  .catch((err) => console.error(err));
