import { Component } from '@angular/core';
import { Service, EdgeConfig, Edge } from '../../../../shared/shared';
import { ActivatedRoute } from '@angular/router';

@Component({
    selector: ChpSocChartOverviewComponent.SELECTOR,
    templateUrl: './chpsocchartoverview.component.html'
})
export class ChpSocChartOverviewComponent {

    public edge: Edge = null;
    public config: EdgeConfig;

    public component: EdgeConfig.Component;

    private static readonly SELECTOR = "chpsoc-overview";

    constructor(
        public service: Service,
        private route: ActivatedRoute,
    ) { }

    ngOnInit() {
        this.service.startSpinner("chpsocOverview");
        this.service.setCurrentComponent('', this.route).then(edge => {
            this.service.getConfig().then(config => {
                this.edge = edge;
                this.config = config;
                this.component = config.getComponent(this.route.snapshot.params.componentId);
                this.service.stopSpinner("chpsocOverview");
            })
        })
    }
}