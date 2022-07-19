### Watch your image being built:
```aidl
# View image resource status
kubectl get images
kubectl get image my-image
kp image status my-image

# View build logs of my-image
kp build logs my-image

# View builds
kubectl get builds
```

Push app chart to chartmuseum
```aidl
helm cm-push chart/ chartmuseum
```
Install your chart from chartmuseum onto the cluster
```aidl
helm repo update
helm search repo chartmuseum/example-app-chart

helm install chartmuseum/example-app-chart --generate-name
helm list flux-system
helm uninstall <release name>

# View deployment
kubectl get deployments
kubectl get deployment example-app -owide

# View pod 
kubectl get pods

kubectl describe pod example-app-c4db594b-4zvxz
kubectl logs example-app-c4db594b-4zvxz

kubectl port-forward example-app-6cfc46547d-sdbzt  8080:8080

#View app 
http://localhost:8080/
kubectl exec -it example-app-5998bf6855-fzpgf -- sh

```

View image build:
```aidl
# View image resource status
kubectl get images
kubectl get image my-image
kp image status my-image

# View build logs of my-image
kp build logs my-image

# View builds
kubectl get builds
```