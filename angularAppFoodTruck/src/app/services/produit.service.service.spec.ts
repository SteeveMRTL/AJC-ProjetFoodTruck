import { TestBed } from '@angular/core/testing';

import { Produit.ServiceService } from './produit.service.service';

describe('Produit.ServiceService', () => {
  let service: Produit.ServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Produit.ServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
